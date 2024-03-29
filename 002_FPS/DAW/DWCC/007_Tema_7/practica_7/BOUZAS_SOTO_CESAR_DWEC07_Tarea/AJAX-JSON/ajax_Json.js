let peticion;
document.addEventListener("DOMContentLoaded", iniciar);



const realizarPeticion = () => {
    peticion = new XMLHttpRequest();
    peticion.open(
        "GET", "https://pokeapi.co/api/v2/pokemon?limit=100000&offset=0");
    peticion.send();
    peticion.addEventListener("load", cargada);
}

function cargada() {
    let respuesta = JSON.parse(peticion.response);
    console.log(respuesta);
    for (let i = 0; i < respuesta.results.length; i++) {
        let fila = document.createElement("tr");
        let columna = document.createElement("td");
        columna.innerHTML = (i + 1) + " " + respuesta.results[i].name;
        fila.appendChild(columna);
        document.getElementById("valores").appendChild(fila);

    }

}

function iniciar() {
    document.getElementById("btn").addEventListener("click", realizarPeticion);
}