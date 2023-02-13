import org.example.FilmsManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {
    @Test
    public void shouldFindAllFilmNames() {

        FilmsManager manager = new FilmsManager();
        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель Белград");

        String[] expected = {"Бладшот", "Вперед", "Отель Белград"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFilmNames() {

        FilmsManager manager = new FilmsManager();
        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель Белград");

        String[] expected = {"Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastTenFilmNames() {

        FilmsManager manager = new FilmsManager();
        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель Белград");
        manager.addFilm("Терминатор");
        manager.addFilm("Аватар");
        manager.addFilm("Форсаж");
        manager.addFilm("Бэтмэн");
        manager.addFilm("Супермэн");
        manager.addFilm("Мстители");
        manager.addFilm("Назад в будущее");
        manager.addFilm("Звездные войны");
        manager.addFilm("2012");

        String[] expected = {"2012", "Звездные войны", "Назад в будущее", "Мстители", "Супермэн", "Бэтмэн", "Форсаж", "Аватар", "Терминатор", "Отель Белград"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFiveFilmNames() {

        FilmsManager manager = new FilmsManager(5);
        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Отель Белград");
        manager.addFilm("Терминатор");
        manager.addFilm("Аватар");
        manager.addFilm("Форсаж");
        manager.addFilm("Бэтмэн");
        manager.addFilm("Супермэн");
        manager.addFilm("Мстители");
        manager.addFilm("Назад в будущее");
        manager.addFilm("Звездные войны");
        manager.addFilm("2012");

        String[] expected = {"2012", "Звездные войны", "Назад в будущее", "Мстители", "Супермэн"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
