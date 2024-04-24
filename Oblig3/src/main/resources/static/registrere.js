



const validering = (film, antall, fornavn, etternavn, tlf, epost) => {
    const visError = (elementId, melding) => {
        const errorSpan = $(`#${elementId}-error`);
        errorSpan.text(melding);
        errorSpan.toggleClass('text-danger', melding !== '');
        errorSpan.toggleClass('invalid-feedback', melding !== '');
    };

    const filmVal = () => {
        if (film === ''){
            visError('filmer', 'Velg en film');
            return false;
        }
        return true;
    };
    const antallVal = () => {
        if (antall < 1){
            visError('antall', 'Antall må være 1 eller mer');
            return false;
        }
        return true;
    };
    const fornavnVal = () => {
        if (fornavn.trim() === ''){
            visError('fornavn', 'Fornavn, Skriv inn ditt fornavn');
            return false;
        }
        return true;
    };
    const etternavnVal = () => {
        if (etternavn.trim() === ''){
            visError('etternavn', 'Etternavn, Skriv inn ditt etternavn');
            return false;
        }
        return true;
    };
    const telefonVal = () => {
        if (tlf.trim() === "" || !/^[0-9]{8}$/.test(tlf)){
            visError('tlf', 'Telefon, skriv inn gyldig telefonnummer');
            return false;
        }
        return true;
    };
    const epostVal = () => {
        if (epost.trim() === "" || !/^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,4}$/.test(epost)){
            visError('epost', 'Epost, Skriv inn gyldig epost');
            return false;
        }
        return true;
    };
    return filmVal() && antallVal() && fornavnVal() && etternavnVal() && telefonVal() && epostVal();
};
function  regKinoBilett() {

    const film = $("#film").val();
    const antall = $("#antall").val();
    const fornavn = $("#fornavn").val();
    const etternavn = $("#etternavn").val();
    const tlf = $("#tlf").val();
    const epost = $("#epost").val();

    if (validering(film, antall, fornavn, etternavn, tlf, epost)) {
        const biletter = {
            film: film,
            antall: antall,
            fornavn: fornavn,
            etternavn: etternavn,
            tlf: tlf,
            epost: epost,
        };

        $.post("/lagre", biletter, function () {
            hentAlle();
        });
      /* window.location.href = "/";*/
    }

    }





