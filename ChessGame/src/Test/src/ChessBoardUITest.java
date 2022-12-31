import UI.ChessBoardUI;
import UI.ChessSquareUI;
import org.assertj.swing.edt.FailOnThreadViolationRepaintManager;
import org.assertj.swing.fixture.JLabelFixture;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import static org.assertj.swing.launcher.ApplicationLauncher.application;

/**
 * Series of automated tests for the ChessSquareUI class.
 * @Author Charles Degrandpré
 * @Last_Updated 2022-12-26
 */
public class ChessBoardUITest {

    private JLabelFixture labelFixture;
    private ChessBoardUI UI;

    @BeforeClass
    public static void setUpOnce() {
        FailOnThreadViolationRepaintManager.install();
    }

    @Before
    public void setUp() {
        UI = new ChessBoardUI();

    }

    @Test
    void constructSquareUI() {

    }

}
