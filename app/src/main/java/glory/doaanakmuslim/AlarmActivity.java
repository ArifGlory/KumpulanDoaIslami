package glory.doaanakmuslim;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class AlarmActivity extends AppCompatActivity {


    TimePickerDialog timePickerDialog;
    final static int RQS1 = 1;
    private static final long delayAlarm = 1 *60 * 1000L;
    TextView txtAlarmPrompt;
    Button btnSetAlarm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarm);

        btnSetAlarm = (Button) findViewById(R.id.btnSetAlarm);
        txtAlarmPrompt = (TextView) findViewById(R.id.txtAlarmPrompt);


        btnSetAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtAlarmPrompt.setText("");
                openTimePickerDialog(false);
            }
        });

    }

    private void openTimePickerDialog(Boolean is24r){

        Calendar calendar = Calendar.getInstance();
        //ini masi ad coding nya
        timePickerDialog = new TimePickerDialog(AlarmActivity.this,onTimeSetListener,calendar.get(Calendar.HOUR_OF_DAY),
                calendar.get(Calendar.MINUTE),true);

        timePickerDialog.setTitle("Set Waktu Alarm");
        timePickerDialog.show();


    }

    TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

            Calendar calNow = Calendar.getInstance();
            Calendar calSet = (Calendar) calNow.clone();

            calSet.set(Calendar.HOUR_OF_DAY,hourOfDay);
            calSet.set(Calendar.MINUTE,minute);
            calSet.set(Calendar.SECOND,0);
            calSet.set(Calendar.MILLISECOND, 0);

            if (calSet.compareTo(calNow) <=0){
                //today set time passed,count to tomorow

                calSet.add(Calendar.DATE,1);
                Log.i("Hasil = ","<=0");
            }else if (calSet.compareTo(calNow) > 0){

                Log.i("Hasil = "," > 0");
            }else {

                Log.i("Hasil = ","else");
            }
            setAlarm(calSet);

        }
    };


    private void setAlarm(Calendar targetCal){
        txtAlarmPrompt.setText("*****\n"+"Alarm Set On "+"\n"
                +targetCal.getTime()+"\n*****");

        Intent i = new Intent(getBaseContext(), AlarmReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(getBaseContext(),RQS1,i,0);
        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
        //alarmManager.set(AlarmManager.RTC_WAKEUP,targetCal.getTimeInMillis(),pendingIntent);

        if (Build.VERSION.SDK_INT < 23){

            if (Build.VERSION.SDK_INT >= 19){
                alarmManager.setExact(AlarmManager.RTC_WAKEUP,targetCal.getTimeInMillis(),pendingIntent);
            }else {
                alarmManager.set(AlarmManager.RTC_WAKEUP,targetCal.getTimeInMillis(),pendingIntent);
            }

        }else {
            alarmManager.setExactAndAllowWhileIdle(AlarmManager.RTC_WAKEUP,targetCal.getTimeInMillis(),pendingIntent);
        }


    }
}
