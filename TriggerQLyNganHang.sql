----Trigger tao tai khoan moi==================================================================
create trigger [dbo].[Trigger_TaoTaiKhoan]
on [dbo].[TaiKhoan]
after insert
as

if EXISTS (select * from [dbo].[TaiKhoan] t1 join inserted t2
on t2.STK = t1.STK WHERE t1.STK IS NOT NULL)
	begin
		print(N'Tạo tài khoản thành công');
		return;
	end
else
	begin
		print(N'Tạo mới không thành công! Số tài khoản đã tồn tại.')
		rollback tran
	end
	
--trigger tao giao dich moi======================================================================
create trigger [dbo].[Trigger_TaoGiaoDich]
on [dbo].[ThongTinGiaoDich]
after insert
as
declare @idTk int set @idTk = (select IdTaiKhoan from inserted)
declare @sodu int
set @sodu = (select SoDu from [dbo].[TaiKhoan] where Id_Tai_Khoan = @idTk) + (select SoTien from inserted)

if(@sodu < 0)
	begin
		print(N'Tài khoản không đủ số dư để thực hiện giao dịch')
		rollback tran
	end
else
	begin
		update [dbo].[TaiKhoan] set SoDu = @sodu where Id_Tai_Khoan = @idTk
		print(N'Thực hiện giao dịch thành công!')
		return
	end
	
--Trigger update số dư tài khoản=========================================================================
CREATE TRIGGER [dbo].[Trigger_Ktra_SoDu_TaiKhoan] 
ON [dbo].[TaiKhoan]
after update
as 
declare @sodu float
set @sodu = (select SoDu from inserted)
if(@sodu < 0)
	begin
		print(N'Số dư phải lớn hơn 0')
		rollback tran
	end
else
	begin
		print(N'Cập nhật số dư thành công!')
		return
	end

----Trigger tao the cho tai khoan ==================================================================
create trigger [dbo].[Trigger_TaoThe] on [dbo].[The]
after insert
as
declare @idTK varchar(255) set @idTK = (select IdTaiKhoan from inserted)
declare @count1 int set @count1 = (select count(*) from [dbo].[TaiKhoan] where Id_Tai_Khoan = @idTK);
declare @mathe varchar(255) set @mathe = (select SoThe from inserted);
declare @count2 int set @count2 = (select count(*) from [dbo].[The] where SoThe = @mathe)
if(@count1 < 1)
	begin
		print(N'Tạo thẻ không thành công! Tài khoản người thụ hưởng không tồn tại.')
		rollback tran
	end
else if(@count2 > 0)
	begin
		print(N'Tạo thẻ không thành công! Mã thẻ đã tồn tại.')
		rollback tran
	end
else 
	begin
		print(N'Tạo thẻ thành công')
		return
	end

----Trigger doi mat khau cho tai khoan ==================================================================
CREATE TRIGGER [dbo].[ktraThe] 
   ON  [dbo].[The] 
   AFTER INSERT,UPDATE
AS 
DECLARE @matkhau NCHAR(20)
SET @matkhau =(SELECT matkhau FROM inserted)
DECLARE @len INT
SET @len = len(@matkhau)
IF(@len >=6 AND @len <=20 )
    BEGIN
    PRINT(N'Cập nhật thành công')
    END
ELSE
    BEGIN
    PRINT(N'Mật khẩu phải nằm trong khoảng 6-20 kí tự')
    ROLLBACK TRAN
    END
----Trigger cap nhat thong tin khach hang ==================================================================
Create TRIGGER [dbo].[ktra_nv]
   ON  [dbo].[Nhanvien] 
   AFTER INSERT,UPDATE
AS 
DECLARE @sDT NCHAR(11)
SET @sDT =(SELECT sdt FROM inserted)
DECLARE @cmt int
SET @cmt =(SELECT len(cmt) FROM inserted)
DECLARE @nsDT INT
SET @nsDT =(LEN(@sdt))
DECLARE @check INT
SET @check = 10
IF(@nsDT = @check AND @sdt LIKE '0%' AND @cmt = 12)
    BEGIN
    PRINT(N'Cập nhật thành công')
    END
ELSE
    BEGIN
    PRINT(N'Thong tin không hợp lệ')
    ROLLBACK TRAN
    END
----Trigger xoa so tiet kiem het thoi han==================================================================
CREATE trigger [dbo].[Trigger_Xoa_STK]
on [dbo].[SoTietKiem]
after DELETE
as
declare @ThoiHan date SET @ThoiHan = (select ThoiHan from [dbo].[SoTietKiem])
declare @HienTai date SET @HienTai = (SELECT GETDATE())

if(@ThoiHan > @HienTai)
	begin
		print 'Xóa thành công'
	end
else
	begin
		print 'Xoa that bai do chua toi han'
		rollback tran

	end
----Trigger xoa tai khoan==================================================================
create trigger [dbo].[Trigger_XoaTaiKhoan]
on [dbo].[TaiKhoan]
after delete
as
declare @idTK int set @idTK = (select Id_Tai_Khoan from deleted)
declare @count int set @count = (select count(*) from [dbo].[The] where IdTaiKhoan = @idTK)

if(@count > 0)
	begin
		update t set t.Status = 0
		from [dbo].[The] as t where t.IdTaiKhoan = @idTK
		return
	end
