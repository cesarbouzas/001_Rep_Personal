let peticion;
document.addEventListener("DOMContentLoaded", iniciar);

function iniciar() {
    document.getElementById("btn").addEventListener("click", consultar);
}

const consultar = () => {
    peticion = new XMLHttpRequest();
    peticion.open("GET", "https://api.openweathermap.org/data/2.5/weather?&mode=xml&lat=43.341394&lon=-8.369388&appid=dc7981aec1f47398a6c8627724b52ea1");
    peticion.send();
    peticion.addEventListener("load", cargar);
}

const cargar = () => {
    let documentacion = peticion.responseXML;
    let contenedor = document.createElement("div");
    let lugar = document.getElementById("localizacion");
    lugar.innerHTML = documentacion.getElementsByTagName("city")[0].getAttribute("name");
    let geograficas = document.getElementById("latlon");
    geograficas.innerText = documentacion.getElementsByTagName("coord")[0].getAttribute("lon") + " ," + documentacion.getElementsByTagName("coord")[0].getAttribute("lat") + " N";
    document.getElementById("valores").appendChild(contenedor);

    document.getElementById("valores").style.display = "block";



}