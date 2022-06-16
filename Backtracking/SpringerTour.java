
package Backtracking;

public class SpringerTour {

	//Die Kombination X_MOVE[i] mit Y_MOVE[i] stellt eine gueltige Bewegung des Springers dar.
	final int[] X_MOVE = {2, 1, -1, -2, -2, -1, 1, 2};
	final int[] Y_MOVE = {1, 2, 2, 1, -1, -2, -2, -1};

	int N;

	// Loesungs-Array zeigt, in welchem Schritt das jeweilige Feld erreicht wurde
	int[][] tour;

	public SpringerTour (int size) {
		N = size;
		// Initialitierung von Loesungs-Array 
		tour = new int[N][N];
		for (int x = 0; x < N; x++)
			for (int y = 0; y < N; y++)
				tour[x][y] = -1;
	}

	@Override
	public String toString() {
		String s = "";
		for (int x = 0; x < N; x++) {
			for (int y = 0; y < N; y++)
				s = s + tour[x][y] + " ";
			s = s + "\n";
		}
		return s;
	}

	// Loese  das Problem mit einer bestimmten Start-Position.
	// Falls eine Loesung gefunden wurde, wird diese ausgedruckt
	void loese(int x, int y)  {

		if (x>=0 && x<N && y>=0 && y<N)
			tour[x][y] = 0;
		else {
			System.out.println("Starting position out of bounds");
			return;
		}

		if (!loeseST(x, y, 1)) {
			System.out.println("Solution does not exist");
		} else
			System.out.println(this);

	}

	// Eine rekursive Methode, um den Springer-Tour-Problem zu loesen
	boolean loeseST(int x, int y, int anzahlSprung) {
        if(anzahlSprung==N*N){
            return true;
        }
        for(int i = 0 ;i<8;i++){
            int x2=x+X_MOVE[i];
            int y2=y+Y_MOVE[i];
            if(x2>=0 && x2<N && y2>=0 && y2<N){
                if(tour[x2][y2]==-1){
                    tour[x2][y2]=anzahlSprung;
                    if(loeseST(x2,y2,anzahlSprung+1)){
                        return true;
                    }
                    else{
                        tour[x2][y2]=-1;
                    }
                }
            }
        }
        return false;
    }



	public static void main(String args[]) {
		SpringerTour st = new SpringerTour(8);
		st.loese(0,7);
	}
}
