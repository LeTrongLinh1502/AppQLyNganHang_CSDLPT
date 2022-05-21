-------- Object:  StoredProcedure [dbo].[chuyenKhoan]    
CREATE PROCEDURE [dbo].[chuyenKhoan] 
	-- Add the parameters for the stored procedure here
	@stkTaiKhoanNguoiGui int=0,
	@stkTaiKhoanNguoiNhan int=0,
	@soTienGui float=0,
	@giaoDichDaThanhCong BIT OUTPUT
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;
	BEGIN TRANSACTION;
	DECLARE @AffectedUser int=0;
DECLARE @soDuSender float=0;
DECLARE @nguoiNhan int =NULL;
DECLARE @nguoiGui int =NULL;
SET @soDuSender=ISNULL((SELECT SoDu FROM dbo.TaiKhoan WHERE dbo.TaiKhoan.STK=@stkTaiKhoanNguoiGui ),0);

SET @nguoiGui=(SELECT Id_Tai_Khoan FROM dbo.TaiKhoan WHERE dbo.TaiKhoan.STK=@stkTaiKhoanNguoiGui);
SET @nguoiNhan=(SELECT Id_Tai_Khoan FROM dbo.TaiKhoan WHERE dbo.TaiKhoan.STK=@stkTaiKhoanNguoiNhan);


IF(@stkTaiKhoanNguoiGui!=@stkTaiKhoanNguoiNhan AND @nguoiNhan IS NOT NULL AND @nguoiGui IS NOT NULL)
BEGIN

UPDATE TaiKhoan SET SoDu=SoDu+@soTienGui WHERE stk=@stkTaiKhoanNguoiNhan;
UPDATE TaiKhoan SET SoDu=SoDu-@soTienGui WHERE STK=@stkTaiKhoanNguoiGui;
SET @soDuSender=(SELECT SoDu FROM dbo.TaiKhoan WHERE dbo.TaiKhoan.STK=@stkTaiKhoanNguoiGui );

IF(@soDuSender<0)
SET @giaoDichDaThanhCong=0;
ELSE
SET @giaoDichDaThanhCong=1;
END
ELSE
SET @giaoDichDaThanhCong=0;

IF(@giaoDichDaThanhCong=0)
ROLLBACK TRAN;
ELSE
BEGIN
INSERT INTO [dbo].[ThongTinGiaoDich]([IdTaiKhoan],[IdTaiKhoanNhan],SoTien,ThoiGian) VALUES(@nguoiGui,@nguoiNhan,@soTienGui,GETDATE());
COMMIT TRAN;

END
    -- Insert statements for procedure here
	
END

