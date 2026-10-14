# To enable ProGuard in your project, edit project.properties
# to define the proguard.config property as described in that file.
#
# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in ${sdk.dir}/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the ProGuard
# include property in project.properties.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

-dontoptimize
-overloadaggressively
#-useuniqueclassmembernames
-repackageclasses ''
-dontnote

#-obfuscationdictionary 'G:\\ZaloNee\\OBFz.txt'
#-classobfuscationdictionary 'G:\\ZaloNee\\OBFz.txt'
#-packageobfuscationdictionary  'G:\\ZaloNee\\OBFz.txt'

-verbose

-dontwarn com.badlogic.gdx.backends.android.AndroidFragmentApplication

# Required if using Gdx-Controllers extension
-keep class com.badlogic.gdx.controllers.android.AndroidControllers

# Required if using Box2D extension
-keepclassmembers class com.badlogic.gdx.physics.box2d.World {
   boolean contactFilter(long, long);
   void    beginContact(long);
   void    endContact(long);
   void    preSolve(long, long);
   void    postSolve(long, long);
   boolean reportFixture(long);
   float   reportRayFixture(long, float, float, float, float, float);
}
-dontwarn java.awt.Color
-dontwarn java.awt.Component
-dontwarn java.awt.ComponentOrientation
-dontwarn java.awt.Container
-dontwarn java.awt.FlowLayout
-dontwarn java.awt.Frame
-dontwarn java.awt.Insets
-dontwarn java.awt.LayoutManager
-dontwarn java.awt.Toolkit
-dontwarn java.awt.datatransfer.Clipboard
-dontwarn java.awt.datatransfer.DataFlavor
-dontwarn java.awt.event.WindowFocusListener
-dontwarn javax.swing.Icon
-dontwarn javax.swing.JDialog
-dontwarn javax.swing.JLabel
-dontwarn javax.swing.JOptionPane
-dontwarn javax.swing.JPanel
-dontwarn javax.swing.JTextField
-dontwarn javax.swing.OverlayLayout
-dontwarn javax.swing.SwingUtilities
-dontwarn javax.swing.border.Border
-dontwarn javax.swing.border.EmptyBorder
-dontwarn javax.swing.event.DocumentListener
-dontwarn javax.swing.text.Document