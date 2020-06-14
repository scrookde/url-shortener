$(document).ready(function () {
    $("#submitButton").click(function () {
        $.ajax({
            type: "POST",
            url: "http://localhost:8080",
            data: JSON.stringify({
                target: $("#url").val(),
                expiryTime: 1000000
            }),
            contentType: "application/json; charset=utf-8",
            success: function (data) {
                console.log(data);
                $("#shorturl").val(data);
            },
            error: function(data) {
                console.log(data);
            }
        })

    })

})