$(function () {
    $("#calcMean").click(function (e) {
        var lista = $('#input').val();
        $.ajax({
            url: '/calcMean?list=' + lista,
            success: function (data) {
                $('#resultMean').text(data);
            }
        })
    });
    $("#calcStdDev").click(function (e) {
        var lista = $('#input').val();
        $.ajax({
            url: '/calcStdDev?list=' + lista,
            success: function (data) {
                $('#resultStddev').text(data);
            }
        })
    });
});