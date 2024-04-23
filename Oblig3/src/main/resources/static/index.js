function slettBiletter() {
    $.get("/slettAlle", function () {
        hentAlle();
    });
}