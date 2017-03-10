import java.util.*;
public class CarExcercise {
	private static double deg2rad(double deg) {
		return (deg * Math.PI / 180.0);
	}
	private static double rad2deg(double rad) {
		return (rad * 180 / Math.PI);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		List carLength = new ArrayList();
		List latitude = new ArrayList();
		List longitude = new ArrayList();
		StringTokenizer s2 = new StringTokenizer(s1);
		while(s2.hasMoreTokens()) {
			carLength.add(s2.nextToken(","));
			latitude.add(s2.nextToken(","));
			longitude.add(s2.nextToken(", "));
		}
	/*	System.out.println(carLength);
		System.out.println(latitude);
		System.out.println(longitude); */
		for(int i = 0; i < carLength.size(); i++) {
			for(int j = 0 ; j<=carLength.size() && j != i; j++) {
				double lat1 = (double)latitude.get(i);
				double lat2 = (double)latitude.get(j);
				double lon1 = (double)latitude.get(i);
				double lon2 = (double)latitude.get(j);
				double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2));
				dist = Math.acos(dist);
				dist = dist + (double)carLength.get(i);
				dist = rad2deg(dist);
				if(dist<5) {
					System.out.println("The cars are very close to each other, they may crash");
					
				}
				else {
					System.out.println("The cars are maintaining a suitable distance");
				}
			}
		}
    
	}

}
