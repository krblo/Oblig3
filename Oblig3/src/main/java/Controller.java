import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

public class Controller {

@Autowired
private Repository rep;

    @PostMapping("/lagre")
    public void lagreBilett(Biletter innBiletter) {
        rep.lagreBilett(innBiletter);
    }

    @GetMapping("/hentAlle")
    public List<Biletter> hentAlle() {
        return rep.hentAlleBiletter();
    }

    @GetMapping("/slettAlle")
    public void slettAlle() {
        rep.slettAlleBiletter();
    }
}
