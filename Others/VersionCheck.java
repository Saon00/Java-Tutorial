import java.lang.Runtime.Version;

public class VersionChecking {
	public static void main(String[] args) {
		
		Version version = java.lang.Runtime.version();
		System.out.println("Java Vesion: "+version);
		System.out.println("Java Vesion Feature Element: "+version.feature());
		System.out.println("Java Vesion Interim Element: "+version.interim());
		System.out.println("Java Patch Element Vesion: "+version.patch());
		System.out.println("Java Update Element Vesion: "+version.update());
		System.out.println("Java Vesion Build: "+version.build().get());
		System.out.println("Java Pre-Realse Info: "+version.pre().orElse("NA"));
	}
}
