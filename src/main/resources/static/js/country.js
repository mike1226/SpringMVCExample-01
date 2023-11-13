function doGet(){
    $.ajax({
        url: "/country",
        type: "GET",
        success: function(data){
            $("#country").html(data);
        }
    });
}