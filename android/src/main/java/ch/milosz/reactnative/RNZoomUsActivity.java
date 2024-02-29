package ch.milosz.reactnative;

import us.zoom.sdk.ZoomSDK;
import us.zoom.sdk.NewMeetingActivity;
import android.view.WindowManager;
import android.os.Bundle;

public class RNZoomUsActivity extends NewMeetingActivity {

   /*onCreate Added by Sridhar*/
  @Override
  protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      getWindow().setFlags(WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE);
  }
  public void onBackPressed() {
    onClickLeave();
  }
}
