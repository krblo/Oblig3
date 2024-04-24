


function hentAlle(){
    $.get("/hentAlle", function ( biletter) {
        formaterData(biletter);
    })
}
function formaterData(biletter){
    let ut = "<table class='table'><tr>" +
        "<th>Film</th><th>Antall</th><th>Fornavn</th><th>Etternavn</th><th>Telefonnr</th><th>Epost</th>" +
        "</tr>";
    for (const b of biletter) {
        ut += "<tr><td>" + b.film + "</td><td>" + b.antall + "</td><td>" + b.fornavn + "</td>" +
            "<td>" + b.etternavn + "</td><td>" + b.tlf + "</td><td>" + b.epost + "</td>" +
            "<td> <a class='btn btn-primary' href='endre.html?=id"+ b.id +"' >Endre</a></td>" +
            "<td> <button class='btn btn-danger' onclick='slettEnBilett(" + b.id + ")'>Slett</button></td>" +
            "</tr>";
    }
    ut+= "</table>";
    $("#billetListe").html(ut);
}
function slettEnBilett(id){
    const url = "/slettEnKunde?=id"+id;
    $.get(url, function () {
        window.location.href = "/"
    })
}





function slettBiletter() {
    $.get("/slettAlle", function () {
        hentAlle();
    });
}