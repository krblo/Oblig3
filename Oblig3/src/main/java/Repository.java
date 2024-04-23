import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
@org.springframework.stereotype.Repository
public class Repository {
    @Autowired
    private JdbcTemplate db;

    public void lagreBilett(Biletter biletter) {
        String sql = "INSERT INTO Biletter (film,antall,fornavn,etternavn,tlf,epost) VALUES(?,?,?,?,?,?,)";
        this.db.update(sql, new Object[]{biletter.getFilm(), biletter.getAntall(), biletter.getFornavn(), biletter.getEtternavn(), biletter.getTlf(), biletter.getEpost()});
    }

    public List<Biletter> hentAlle() {
        String sql = "SELECT * FROM Biletter";
        List<Biletter> alleBiletter = this.db.query(sql, new BeanPropertyRowMapper(Biletter.class));
        return alleBiletter;
    }

    public Biletter hentEnBilett(int id) {
        Object[] param = new Object[]{id};
        String sql = "SELECT * FROM Biletter WHERE id=?";
        Biletter enBilett = (Biletter)this.db.queryForObject(sql, param, BeanPropertyRowMapper.newInstance(Biletter.class));
        return enBilett;
    }

    public void endreEnBilett(Biletter biletter) {
        String sql = "UPDATE Biletter SET film=?,antall=?, fornavn=?, etternavn=?, tlf=?, epost=?, where id=?";
        this.db.update(sql, new Object[]{biletter.getFilm(), biletter.getAntall(), biletter.getFornavn(), biletter.getEtternavn(), biletter.getTlf(), biletter.getEpost(), biletter.getId()});
    }

    public void slettEnBilett(int id) {
        String sql = "DELETE FROM Biletter WHERE id=?";
        this.db.update(sql, new Object[]{id});
    }

    public void slettAlleBiletter() {
        String sql = "DELETE FROM Biletter";
        this.db.update(sql);
    }
}

