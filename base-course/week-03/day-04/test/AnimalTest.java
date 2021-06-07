import static org.junit.Assert.*;


import org.junit.Test;

public class AnimalTest {
  Animal animal = new Animal();

  @Test
  public void play_increasesHungerAndThirst() {
    animal.play();
    assertEquals(51, animal.thirst);
    assertEquals(51, animal.hunger);
  }

  @Test
  public void eat_decreasesHunger() {
    animal.eat();
    assertEquals(49,animal.hunger);
  }

  @Test
  public void drink_decreasesThirst() {
    animal.drink();
    assertEquals(49,animal.thirst);
  }

  @Test
  public void play_increasesHungerButNotThirst_False() {
    animal.play();
    assertEquals(50, animal.thirst);
  }

}