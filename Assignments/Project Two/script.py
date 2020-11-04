import sys
import time
import subprocess
from com.android.monkeyrunner import MonkeyRunner, MonkeyDevice

subprocess.call("..\\..\\platform-tools\\adb.exe logcat -c", shell=True)
device = MonkeyRunner.waitForConnection()

#device.touch(547, 1510, MonkeyDevice.DOWN_AND_UP)
#time.sleep(2)

device.startActivity(component='com.android.contacts/.activities.PeopleActivity')
time.sleep(2)

device.touch(965, 1675, MonkeyDevice.DOWN_AND_UP)
time.sleep(2)

#device.touch(321, 1045, MonkeyDevice.DOWN_AND_UP)
#time.sleep(2)

#device.touch(216, 1002, MonkeyDevice.DOWN_AND_UP)
#time.sleep(2)


#device.type('sean')
#time.sleep(1)

device.press('KEYCODE_ENTER', MonkeyDevice.DOWN_AND_UP)
time.sleep(1)

#device.type('2102223333')
#time.sleep(1)

device.touch(1003, 155, MonkeyDevice.DOWN_AND_UP)
time.sleep(1)

device.touch(986, 151, MonkeyDevice.DOWN_AND_UP)
time.sleep(1)

device.touch(986, 151, MonkeyDevice.DOWN_AND_UP)
time.sleep(1)


device.touch(647, 980, MonkeyDevice.DOWN_AND_UP)
time.sleep(1)

device.press('KEYCODE_BACK', MonkeyDevice.DOWN_AND_UP)
time.sleep(1)

subprocess.call("..\\..\\platform-tools\\adb.exe logcat -d > log.txt", shell=True)
#subprocess.call("taskkill /f /im adb.exe", shell=True)
