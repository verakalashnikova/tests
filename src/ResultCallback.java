import com.appspot.tictactoe_java_sample.tictactoe.model.Board;

public interface ResultCallback<T> {

	void onResultReceived(Board board) throws Exception;

}
