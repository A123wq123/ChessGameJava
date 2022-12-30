import Utility.Position;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Series of automated tests for the Position class.
 * @Author Charles Degrandpré
 * @Last_Updated 2022-12-26
 */
public class PositionTest {

    @Test
    void createPosition() {
        try {
            new Position(5, 3);
        } catch (Exception e) {
            throw new RuntimeException("Could not create a position element");
        }
    }

    @Test
    void createPositionCoordinates() {
        Position newPosition = new Position(5, 3);
        assertEquals(5, newPosition.getCoordX());
        assertEquals(3, newPosition.getCoordY());
    }

    @Test
    void createPositionNegativeCoordinates() {
        try {
            new Position(-1, -3);
        } catch (Exception ignored) {
            return;
        }
        assert false;
    }

    @Test
    void sumCoordinates() {
        Position newPosition = new Position(5, 3);
        assertEquals(8, newPosition.sumCoordinates());
    }

    @Test
    void sumPositionsPositions() {
        Position newPosition1 = new Position(5, 3);
        Position newPosition2 = new Position(1, 1);
        Position newPosition3 = null;
        try {
            newPosition3 =  newPosition1.sumPosition(newPosition2);
        } catch (Exception ignored) {

        }
        assert newPosition3 != null;
        assertEquals(6, newPosition3.getCoordX());
        assertEquals(4, newPosition3.getCoordY());
    }

    @Test
    void sumPositionsPositionsInvalid() {
        Position newPosition1 = new Position(5, 3);
        Position newPosition2 = new Position(4, 6);
        Position newPosition3 = null;
        try {
            newPosition3 =  newPosition1.sumPosition(newPosition2);
        } catch (Exception ignored) {
        }
        assert newPosition3 == null;
    }

    @Test
    void sumPositionsCoordinates() {
        Position newPosition1 = new Position(5, 3);
        Position newPosition2 = null;
        try {
            newPosition2 =  newPosition1.sumPosition(1, 1);
        } catch (Exception ignored) {

        }
        assert newPosition2 != null;
        assertEquals(6, newPosition2.getCoordX());
        assertEquals(4, newPosition2.getCoordY());
    }

    @Test
    void sumPositionsCoordinatesInvalid() {
        Position newPosition1 = new Position(5, 3);
        Position newPosition2 = null;
        try {
            newPosition2 =  newPosition1.sumPosition(4, 6);
        } catch (Exception ignored) {
        }
        assert newPosition2 == null;
    }
}