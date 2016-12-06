# MyDynamicToastLibrary
This is an Android Library for developer to use Android Toast and Customized Toast easily.

<p>
<img src="https://raw.githubusercontent.com/vatsaldesai92/MyDynamicToastLibrary/master/app/src/main/assets/images/mydynamictoast1.png" alt="screenshot" width="270">
<img src="https://raw.githubusercontent.com/vatsaldesai92/MyDynamicToastLibrary/master/app/src/main/assets/images/mydynamictoast2.png" alt="screenshot" width="270">
<img src="https://raw.githubusercontent.com/vatsaldesai92/MyDynamicToastLibrary/master/app/src/main/assets/images/mydynamictoast3.png" alt="screenshot" width="270">
<img src="https://raw.githubusercontent.com/vatsaldesai92/MyDynamicToastLibrary/master/app/src/main/assets/images/mydynamictoast4.png" alt="screenshot" width="270">
</p>

##Download

###Gradle dependency:
- Add the following to your project level build.gradle:
~~~
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
~~~
- Add this to your app build.gradle:
~~~
dependencies {
  compile 'com.github.vatsaldesai92:MyDynamicToastLibrary:1.0.1'
}
~~~

##Usage

### There are 5 types of Toast.
~~~
1) Error Toast

  Just pass context & error message as like bellow exampe.
  
  MyDynamicToast.errorMessage(MainActivity.this, "error toast message..");
~~~
~~~
2) Warning Toast

  Just pass context & warning message as like bellow exampe.
  
  MyDynamicToast.warningMessage(MainActivity.this, "warning toast message1234546677889023489..");
~~~
~~~
3) Success Toast

  Just pass context & success message as like bellow exampe.
  
  MyDynamicToast.successMessage(MainActivity.this, "success toast message..");
~~~
~~~
4) Information Toast

  Just pass context & information message as like bellow exampe.
  
  MyDynamicToast.informationMessage(MainActivity.this, "information toast message1234546677889023489..");
~~~
~~~
5) Custom Toast

  User can customize Toast as like bellow exampe.
  
  MyCustomToast myCustomToast = new MyCustomToast(MainActivity.this);
                myCustomToast.setCustomMessageText("custom toast message..");
                myCustomToast.setCustomMessageTextSize(18);
                myCustomToast.setCustomMessageTextColor(Color.WHITE);
                myCustomToast.setCustomMessageIcon(R.drawable.ic_success, MyCustomToast.POSITION_LEFT);
                myCustomToast.setCustomMessageIconColor(Color.WHITE);
//                myCustomToast.setCustomMessageBackgroundColor("#853657");
                myCustomToast.setCustomMessageBackgroundDrawable(R.drawable.info_message_background);
                myCustomToast.setCustomMessageDuration(MyCustomToast.LENGTH_LONG);
                myCustomToast.setGravity(Gravity.CENTER, 0, 0);
                myCustomToast.setCustomMessageTypeface("cambriai.ttf");
                myCustomToast.show();
~~~

<img src="https://raw.githubusercontent.com/vatsaldesai92/MyDynamicToastLibrary/master/app/src/main/assets/images/mydynamictoast5.png" alt="screenshot" width="270">

##Usage Example

https://github.com/vatsaldesai92/MyDynamicToastLibrary/tree/master/app

##License
~~~
Apache Version 2.0
~~~
