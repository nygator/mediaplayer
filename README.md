# mediaplayer

Important things when using this code on other projects:

1. You need to have the /res/xml/network_security_config.xml file with whatever this repo has
2. You need to have permissions in your AndroidManifest.xml which are
    <uses-permission android:name="android.permission.INTERNET" />
    <uses-permission android:name="android.permissions.WAKE_LOCK" />
3. Inside the AndroidManifest.xml <application... you need to have
    android:networkSecurityConfig="@xml/network_security_config"
    android:usesCleartextTraffic="true"
    
Then this code should work.
Or it doesn't exactly work, you can start listening to the radio with the button and stop listening by pressing it again (and it does play in the background btw.), but you can't restart it without restarting the application.
