package kvadratna;

public class Kvadratna {
    public static void main(String[] args) {
        if (args.length==3){
            double a = Double.parseDouble(args[0]);
			double b = Double.parseDouble(args[1]);
			double c = Double.parseDouble(args[2]);
			
			double d = b * b - 4 * a * c;
			if (d > 0) {
				double x1 = (-b + Math.sqrt(d)) / (2*a);
				double x2 = (-b - Math.sqrt(d)) / (2*a);
				System.out.println("X1= " + x1 + " X2= " + x2);
			}
			else if (d == 0) {
				double x = -b / (2*a);				
				System.out.println("x = ", x);
			}
			else {
				System.out.println("Nema rješenja u realnoj domeni");
			}
		}
		else {
			System.out.println("Neispravan unos argumenata.");						
		}		
        }
    }

