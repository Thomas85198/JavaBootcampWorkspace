
public class getBucketCount {

	public static void main(String[] args) {
		
	}

	public static int getBucketCount(double width, double height, double areaPerBucket, double extraBuckets) {
		if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
			return -1;
		} else {
			double area = width * height;
			double bucketsNeeded = Math.ceil(area / areaPerBucket);
			return (int) (bucketsNeeded - extraBuckets);
		}
	}

	public static int getBucketCount(double width, double height, double areaPerBucket) {
		if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
			return -1;
		} else {
			return getBucketCount(width, height, areaPerBucket, 0);
		}

	}
	public static int getBucketCount (double area, double areaPerBucket) {
	    if (area <= 0 || areaPerBucket <= 0) {
	        return -1;
	    } else {
	        double width = Math.sqrt(area);
	        double height = Math.sqrt(area);
	        return getBucketCount(width, height,
	                areaPerBucket);
	    }
	}
	

}
