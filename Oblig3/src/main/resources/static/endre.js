$(function (){
    const id = window.location.search.substring(1);
    const url = "/hentEnKunde?"+id;
    $.get(url,function (biletter){
        $("#id").val(biletter.id)
        $("#film").val(biletter.film);
        $("#antall").val(biletter.antall);
        $("#fornavn").val(biletter.fornavn);
        $("#etternavn").val(biletter.etternavn);
        $("#tlf").val(biletter.tlf);
        $("#epost").val(biletter.epost);
        });
});

function endreBilett(){
    const biletter = {
        id : $("#id").val(),
        film: $("#film").val(),
        antall: $("#antall").val(),
        fornavn: $("#fornavn").val(),
        etternavn: $("#etternavn").val(),
        tlf: $("#tlf").val(),
        epost: $("#epost").val()
    }
    $.post("/endreEnBilett",biletter,function () {
        window.location.href = 'index.html'
    });
}