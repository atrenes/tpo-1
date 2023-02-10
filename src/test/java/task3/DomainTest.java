package task3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class DomainTest {
    static Match match;
    static Human ford, artur;
    static Thing thing;
    static Room room;

    @BeforeAll
    public static void createAll() {
        match = new Match();
        match.fire();
        ford = new Human(1, "Форд", "мужчина", "ищет выключатель");
        ford.setMatch(match);
        artur = new Human(2, "Артур", "мужчина", "ощупал себя");
        thing = new Thing("фигура", "нечеловеческая");
        ArrayList<Human> humans = new ArrayList<>();
        ArrayList<Thing> things = new ArrayList<>();
        humans.add(ford);
        humans.add(artur);
        things.add(thing);
        room = new Room("раздражающий прелый", "низкий гул", humans, things);
    }

    @Test
    public void toStringCheck() {
        assertEquals(match.toString(), match.getIsLit() ? "горит" : "не горит");
        assertEquals(ford.toString(), "id: 1, имя: Форд, пол: мужчина, делает: ищет выключатель, держит спичку которая" + (!match.getIsLit() ? " не " : "") + "горит");
        assertEquals(artur.toString(), "id: 2, имя: Артур, пол: мужчина, делает: ощупал себя, не держит спичку");
        assertEquals(thing.toString(), "имя существа: фигура, характеристика: нечеловеческая");
        assertEquals(room.toString(), "в комнате запах раздражающий прелый и звук низкий гул, 2 людей и 1 существ");
    }

    @Test
    public void matchLitCheck() {
        assertTrue(match.getIsLit());
        match.putOut();
        assertFalse(match.getIsLit());
        match.fire(); // спичка не загорится после того как ее потушить
        assertFalse(match.getIsLit());
    }

    @Test
    public void thingDescriptionCheck() {
        assertEquals(thing.getDescription(), "нечеловеческая");
        thing.setDescription("страшная");
        assertEquals(thing.getDescription(), "страшная");
        thing.setDescription("нечеловеческая");
        assertEquals(thing.getDescription(), "нечеловеческая");
    }

    @Test
    public void roomParamsCheck() {
        room.setSmell("рыба");
        assertEquals(room.getSmell(), "рыба");
        room.setSmell("раздражающий прелый");
        assertEquals(room.getSmell(), "раздражающий прелый");

        room.setSound("сирена");
        assertEquals(room.getSound(), "сирена");
        room.setSound("низкий гул");
        assertEquals(room.getSound(), "низкий гул");
    }

    @Test
    public void roomListCheck() {
        Human human = new Human(3, "Джейн", "женщина", "читает");
        Thing thing = new Thing("вещь", "");

        assertEquals(room.getHumanNum(), 2);
        assertEquals(room.getThingNum(), 1);
        room.addHuman(human);
        assertEquals(room.getHumanNum(), 3);
        room.removeHuman(human);

        assertEquals(room.getThingNum(),1);
        room.addThing(thing);
        assertEquals(room.getThingNum(), 2);
        room.removeThing(thing);
        assertEquals(room.getThingNum(),1);
    }

    @Test
    public void humanParamsCheck() {
        Human human = new Human(3, "Джейн", "женщина", "читает");
        Match match = new Match();
        assertNull(human.getMatch());
        human.setMatch(match);
        assertEquals(human.getMatch(), match);

        assertEquals(human.getPersonId(), 3);
        assertEquals(human.getName(), "Джейн");
        assertEquals(human.getSex(), "женщина");
        assertEquals(human.getAction(), "читает");
        human.setAction("отдыхает");
        assertEquals(human.getAction(), "отдыхает");
    }
}
