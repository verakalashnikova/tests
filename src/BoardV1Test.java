import static org.junit.Assert.*;

import java.io.IOException;
import java.util.concurrent.Callable;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.appspot.tictactoe_java_sample.tictactoe.Tictactoe;
import com.appspot.tictactoe_java_sample.tictactoe.Tictactoe.Board.Getmove;
import com.appspot.tictactoe_java_sample.tictactoe.model.Board;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.apache.ApacheHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;
import com.google.api.client.http.apache.ApacheHttpTransport;

public class BoardV1Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws IOException {
		Tictactoe service = new Tictactoe.Builder(new ApacheHttpTransport.Builder().build(),
				new JacksonFactory(), null).build();
		
		String state = "X--------";
		Board newBoard = new Board();
		newBoard.setState(state);

		Getmove getmove = service.board().getmove(newBoard);
		
		// Would be async API
//		ResultCallback<Board> resultCallback = new ResultCallback<Board>() {
//
//			@Override
//			public void onResultReceived(Board board) throws Exception {
//				assertTrue(board.getState().contains("O"));
//			}
//		};
//		getmove.executeAsync(resultCallback);

		// Real - synchronous API
		Board execute = getmove.execute();
		assertTrue(execute.getState().contains("O"));
		
		
	}

}
