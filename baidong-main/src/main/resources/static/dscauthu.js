$("#btndangky").on("click", function() {
    let count = 0;
    $('input:checkbox:checked').each((k) => {
        count++;
    })
    if (count == 16) alert("đăng ký thành công")
    else if (count <= 16) alert("Chọn thêm cầu thủ")
    else alert("Danh sách chỉ có 16 cầu thủ")

})