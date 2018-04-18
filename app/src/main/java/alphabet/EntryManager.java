package alphabet;

import android.util.Log;

public class EntryManager {
	public AlphabetEntry getEntryForKey(char c) {
		Log.d(AlphabetGameActivity.LOG_TAG, "getEntryFor " + c + " ("
				+ ((int) c) + ")");
		c = Character.toUpperCase(c);
		switch (c) {
			case 0:
				return null;
			default:
				try {
					return EntryEnum.valueOf(Character.toString(c));
				} catch (Exception e) {
					return null;
				}
		}
	}

	public interface AlphabetEntry {
		public int getSoundId();

		public int getImageId();

		public char getCharacter();
	}

	private enum EntryEnum implements AlphabetEntry {
		A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z;

		public int getSoundId() {
			switch (this) {
				case B:
					return alphabet.R.raw.b;
				case C:
					return alphabet.R.raw.c;
				case D:
					return alphabet.R.raw.d;
				case E:
					return alphabet.R.raw.e;
				case F:
					return alphabet.R.raw.f;
				case G:
					return alphabet.R.raw.g;
				case H:
					return alphabet.R.raw.h;
				case I:
					return alphabet.R.raw.i;
				case J:
					return alphabet.R.raw.j;
				case K:
					return alphabet.R.raw.k;
				case L:
					return alphabet.R.raw.l;
				case M:
					return alphabet.R.raw.m;
				case N:
					return alphabet.R.raw.n;
				case O:
					return alphabet.R.raw.o;
				case P:
					return alphabet.R.raw.p;
				case Q:
					return alphabet.R.raw.q;
				case R:
					return alphabet.R.raw.r;
				case S:
					return alphabet.R.raw.s;
				case T:
					return alphabet.R.raw.t;
				case U:
					return alphabet.R.raw.u;
				case V:
					return alphabet.R.raw.v;
				case W:
					return alphabet.R.raw.w;
				case X:
					return alphabet.R.raw.x;
				case Y:
					return alphabet.R.raw.y;
				case Z:
					return alphabet.R.raw.z;
				case A:
					return alphabet.R.raw.a;
				default:
					return alphabet.R.raw.a;
			}

		}

		@Override
		public int getImageId() {
			switch (this) {
				case B:
					return alphabet.R.drawable.b;
				case C:
					return alphabet.R.drawable.c;
				case D:
					return alphabet.R.drawable.d;
				case E:
					return alphabet.R.drawable.e;
				case F:
					return alphabet.R.drawable.f;
				case G:
					return alphabet.R.drawable.g;
				case H:
					return alphabet.R.drawable.h;
				case I:
					return alphabet.R.drawable.i;
				case J:
					return alphabet.R.drawable.j;
				case K:
					return alphabet.R.drawable.k;
				case L:
					return alphabet.R.drawable.l;
				case M:
					return alphabet.R.drawable.m;
				case N:
					return alphabet.R.drawable.n;
				case O:
					return alphabet.R.drawable.o;
				case P:
					return alphabet.R.drawable.p;
				case Q:
					return alphabet.R.drawable.q;
				case R:
					return alphabet.R.drawable.r;
				case S:
					return alphabet.R.drawable.s;
				case T:
					return alphabet.R.drawable.t;
				case U:
					return alphabet.R.drawable.u;
				case V:
					return alphabet.R.drawable.v;
				case W:
					return alphabet.R.drawable.w;
				case X:
					return alphabet.R.drawable.x;
				case Y:
					return alphabet.R.drawable.y;
				case Z:
					return alphabet.R.drawable.z;
				case A:
					return alphabet.R.drawable.a;
				default:
					return alphabet.R.raw.a;
			}
		}

		@Override
		public char getCharacter() {
			switch (this) {
				default:
					return Character.toLowerCase(name().charAt(0));
			}
		}
	}
}
