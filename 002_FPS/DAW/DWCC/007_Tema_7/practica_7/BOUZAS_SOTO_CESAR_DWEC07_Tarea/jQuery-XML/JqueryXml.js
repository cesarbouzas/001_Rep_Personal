$().ready(() => {
    $.get(
        "https://api.openweathermap.org/data/2.5/weather?&mode=xml&lat=43.341394&lon=-8.369388&appid=dc7981aec1f47398a6c8627724b52ea1",
        function(valor) {
            $(valor).find("city").each(function() {
                let name = $(this).attr("name");
                $("#localizacion").append(name);
            });
            $(valor).find("coord").each(function() {
                let long = $(this).attr("lon");
                let lat = $(this).attr("lat");
                $("#latlon").append(long + "," + lat);
            });
        }
    );
});