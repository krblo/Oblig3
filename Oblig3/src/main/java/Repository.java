import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {
    @Autowired
    private JdbcTemplate db;

    public void lagreBilett(Biletter innBilett){
        String sql = "INSERT INTO Biletter (film, antall, fornavn, etternavn, tlf, epost) VALUES(?,?,?,?,?,?)";
        db.update(sql, innBilett.getAntall(), innBilett.getAntall(), innBilett.getFornavn(), innBilett.getEtternavn(), innBilett.getTlf(), innBilett.getEpost());
    }
    public List<Biletter>hentAlleBiletter(){
        String sql = "SELECT * FROM Biletter";
        List<Biletter> alleBiletter = db.query(sql, new BeanPropertyRowMapper<>(Biletter.class));
        return alleBiletter;
    }
    public  void slettAlleBiletter(){
        String sql = "DELETE FROM Biletter";
        db.update(sql);
    }
}

