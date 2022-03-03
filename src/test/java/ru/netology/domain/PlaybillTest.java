package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlaybillTest {
    private Manager service = new Manager();
    private Playbill film1 = new Playbill(1, "Бладшот", "боевик");
    private Playbill film2 = new Playbill(2, "Вперёд", "мультфильм");
    private Playbill film3 = new Playbill(3, "Отель Белград", "комедия");
    private Playbill film4 = new Playbill(4, "Джентельмены", "боевик");
    private Playbill film5 = new Playbill(5, "Человек-невидимка", "ужасы");
    private Playbill film6 = new Playbill(6, "Тролли. Мировой тур", "мультфильм");
    private Playbill film7 = new Playbill(7, "Номер один", "комедия");
    private Playbill film8 = new Playbill(8, "Вспомнить все", "боевик");
    private Playbill film9 = new Playbill(9, "Лунтик", "мультфильм");
    private Playbill film10 = new Playbill(10, "Человек-паук", "приключения");
    private Playbill film11 = new Playbill(11, "Люди икс", "боевик");

    @Test
    public void add() {
        Playbill[] expected = {film1, film2, film3, film4, film5, film6, film7, film8, film9, film10};

        service.add(film1);
        service.add(film2);
        service.add(film3);
        service.add(film4);
        service.add(film5);
        service.add(film6);
        service.add(film7);
        service.add(film8);
        service.add(film9);
        service.add(film10);

        assertArrayEquals(expected, service.findAll());
    }

    @Test
    public void findLast() {
        Manager manager = new Manager();
        Playbill[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);
        assertArrayEquals(expected, manager.findLast());

    }

    @Test
    public void shouldLastIfLimitDefault() {
        Manager manager = new Manager();
        Playbill[] expected = {film10, film9, film8, film7, film6, film5,};

        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);

        assertArrayEquals(expected, manager.findLast());
    }

    @Test
    public void shouldLastIfOverLimit() {
        Manager manager = new Manager();
        Playbill[] expected = {film11, film10, film9, film8, film7, film6,};
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);
        manager.add(film11);
    }


}