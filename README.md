# LogUtil
基于Logger封装的日志LogUtil

## 提供功能：

* 格式化的log日志
* 线程信息
* 所在的类，方法调用栈信息
* 可以跳转到源码
* pretty json内容
* pretty xml内容

## 其他功能
上面的功能都是[logger](https://github.com/orhanobut/logger "https://github.com/orhanobut/logger")提供了。logger只提供了log是开还是关。比如有的是debug环境可以输出log，release环境输出warn及其以上级别的log。
* 自定义debug和release环境log输出的级别

## 注意
* 在`app/build.gradle`通过buildConfigField添加一个`LOG_DEBUG`

```groovy
android {
    // ...
    buildTypes {
        release {
            buildConfigField "boolean", "LOG_DEBUG", "false"
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
        debug {
            buildConfigField "boolean", "LOG_DEBUG", "true"
        }
    }
}
```

* 默认情况下，debug环境在输出所有级别的log；elease环境下只输出warn,error,assert级别的log。要修改debug或者release级别，修改`LogUtil#LOG_DEBUG_LEVEL`或`LogUtil#LOG_RELEASE_LEVEL`就行

* 使用

```java
LogUtil.v("hello");
LogUtil.d("hello");
LogUtil.i("hello");
LogUtil.w("hello");
LogUtil.e("hello");
LogUtil.wtf("hello");
LogUtil.json("{\"name\":\"hacket\",\"pass\":\"123456\"}");
LogUtil.xml("<root><name>hacket</name><pass>123456</pass></root>");
try {
    String s = null;
    s.toString();
} catch (Exception e) {
    LogUtil.e("hello", e, e.getMessage());
    LogUtil.printStackTrace(e);
}

LogUtil.v("tag", "hacket");
LogUtil.d("tag", "hacket");
LogUtil.i("tag", "hacket");
LogUtil.w("tag", "hacket");
LogUtil.e("tag", "hacket");
LogUtil.wtf("tag", "hacket");
LogUtil.json("tag", "{\"name\":\"hacket\",\"pass\":\"123456\"}");
LogUtil.xml("tag", "<root><name>hacket</name><pass>123456</pass></root>");

LogUtil.e(null, "this is a null tag");
```
* 效果

[![log效果](https://github.com/hacket/LogUtil/blob/master/img/log.png "log效果")](https://github.com/hacket/LogUtil "log效果")

## License

    Copyright 2020 hacket

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
