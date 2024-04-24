import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class Controller {

    @Autowired
    private BilettRepo rep;


    @PostMapping("/lagreBilett")
    public void lagreBilett(Biletter biletter) {
        rep.lagreBilett(biletter);
    }
    @GetMapping({"/hentEnKunde"})
    public Biletter hentEnBilett(int id) {
        return this.rep.hentEnBilett(id);
    }

    @PostMapping({"/endreEnBilett"})
    public void endreEnBilett(Biletter biletter) {
        this.rep.endreEnBilett(biletter);
    }
    @GetMapping("/hentAlle")
    public List<Biletter> hentAlle() {
        return rep.hentAlle();
    }

    @GetMapping({"/slettEnBilett"})
    public void slettEnBilett(int id) {
        this.rep.slettEnBilett(id);
    }

    @GetMapping("/slettAlle")
    public void slettAlle() {
        rep.slettAlleBiletter();
    }
}
