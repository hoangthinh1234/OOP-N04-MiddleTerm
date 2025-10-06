# OOP-N04-MiddleTermControllers (Spring Boot)
    Chức năng chính
Quản lý phim (Movie Management)

    Thêm, sửa, xóa, hiển thị danh sách phim
    Quản lý thông tin: tiêu đề, ngày phát hành, thời gian chiếu, thời lượng, thể loại, độ tuổi, mô tả
    Kiểm tra độ tuổi phù hợp cho khán giả

Quản lý phòng chiếu (Room Management)

    Thêm, sửa, xóa, hiển thị danh sách phòng
    Quản lý thông tin: tên phòng, tổng số ghế

Quản lý suất chiếu (Showtime Management)

    Thêm, sửa, xóa, hiển thị danh sách suất chiếu
    Liên kết phim với phòng chiếu và thời gian bắt đầu

Quản lý ghế ngồi (Seat Management)

    Thêm, sửa, xóa, hiển thị danh sách ghế
    Quản lý ghế theo phòng và số ghế

Quản lý khách hàng (Customer Management)

    Thêm, sửa, xóa, hiển thị danh sách khách hàng
    Quản lý thông tin: tên, email, số điện thoại
    Hệ thống đăng ký và đăng nhập

Quản lý vé (Ticket Management)

    Thêm, sửa, xóa, hiển thị danh sách vé
    Liên kết vé với suất chiếu, ghế ngồi và khách hàng
    Quản lý giá vé
    Tìm kiếm và in vé

Quy trình đặt vé (Booking Process)

    Chọn phim → Chọn suất chiếu → Chọn ghế → Xác nhận thông tin khách hàng
    Thanh toán và tạo vé
    In vé tự động



    MovieController: Xử lý request liên quan đến phim
    CustomerController: Xử lý request liên quan đến khách hàng
    RoomController: Xử lý request liên quan đến phòng
    SeatController: Xử lý request liên quan đến ghế
    ShowtimeController: Xử lý request liên quan đến suất chiếu
    TicketController: Xử lý request liên quan đến vé
    BookingController: Xử lý quy trình đặt vé
    TicketLookupController: Xử lý tìm kiếm vé

![alt text]({275E1978-3176-45C6-821B-0A1B9CA89127}.png)