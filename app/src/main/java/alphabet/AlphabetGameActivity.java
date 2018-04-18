package alphabet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class AlphabetGameActivity extends Activity implements OnClickListener {
	public static final String LOG_TAG = "AlphabetGame";
	public static EntryManager entryManager = new EntryManager();
	public static SoundPlayer soundPlayer = new SoundPlayer();

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// Set up listeners
		View aboutButton = findViewById(R.id.about_button);
		aboutButton.setOnClickListener(this);

		View startButton = findViewById(R.id.start_button);
		startButton.setOnClickListener(this);

		View songButton = findViewById(R.id.song_button);
		songButton.setOnClickListener(this);

		View exitButton = findViewById(R.id.exit_button);
		exitButton.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
				//Nada: add About case
			case R.id.about_button:  
			Log.d(LOG_TAG, "Starting About activity");
			Intent i = new Intent(this, About.class);
			startActivity(i);
			break;

			case R.id.song_button:
				Log.d(LOG_TAG, "Starting Song activity");
				Intent j = new Intent(this, Song.class);
				startActivity(j);
				break;




		case R.id.exit_button:
			Log.d(LOG_TAG, "Exiting");
			finish();
			break;
		case R.id.start_button:
			start();
			break;
		}
	}

	private void start() {
		Log.d(LOG_TAG, "Starting Game");
		Intent i = new Intent(this, Game.class);
		startActivity(i);
	}
}
