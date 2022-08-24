package com.inmo.inmodata.navi;

import android.graphics.Bitmap;

import com.inmo.inmodata.AbstractInfo;
import com.inmo.inmodata.MessageType;
import com.inmo.inmodata.message.Dispatcher;

/**
 * @Author: lt
 * @Description:
 * @email: 379973964@qq.com
 */
@MessageType(type = Dispatcher.NAVI_INFO_IM)
public class IMNaviInfo extends AbstractInfo {
    //==============导航状态=================//
    public final static String START_NAVIGATION_COMMAND = "StartNavigation";
    public final static String PAUSE_NAVIGATION_COMMAND = "PauseNavigation";
    public final static String END_NAVIGATION_COMMAND = "EndNavigation";

    //================sdk================//
    public final static int TYPE_GAODE = 1;
    public final static int TYPE_BAIDU = 2;
    public final static int TYPE_TENCENT = 3;
    public final static int TYPE_OTHER = 4;

    //https://a.amap.com/lbs/static/unzip/Android_Navi_Doc/index.html 具体可以参考
    //左转 2
    public final static String TYPE_LEFT = "left";
    //右转 3
    public final static String TYPE_RIGHT = "right";
    //左前方 4
    public final static String TYPE_LEFT_FRONT = "left_front";
    //右前方 5
    public final static String TYPE_RIGHT_FRONT = "right_front";
    //左后方 6
    public final static String TYPE_LEFT_BACK = "left_back";
    //右后方 7
    public final static String TYPE_RIGHT_BACK = "right_back";
    //掉头 8
    public final static String TYPE_TURN_AROUND = "turn_around";
    //直行  9
    public final static String TYPE_STRAIGHT = "straight";
    //顺行 20
    public final static String TYPE_SPECIAL_CONTINUE = "special_continue";

//    //进入环岛 11
//    public final static String TYPE_ROUNDABOUT = "roundabout";
//    //进入环岛，注意，这个是左侧通行地区的顺时针环岛 17
//    public final static String TYPE_ROUNDABOUT_LEFT_RING = "roundabout_left_ring";
//    //标准小环岛 绕环岛直行，左侧通行地区的顺时针环岛  27
//    public final static String TYPE_ROUNDABOUT_LEFT_RING_CONTINUE = "roundabout_left_ring_continue";
//    //标准小环岛,绕环岛左转,左侧通行地区的顺时针环岛  25
//    public final static String TYPE_ROUNDABOUT_LEFT_RING_LEFT = "roundabout_left_ring_left";
//    //标准小环岛 绕环岛右转，左侧通行地区的顺时针环岛  26
//    public final static String TYPE_ROUNDABOUT_LEFT_RING_RIGHT = "roundabout_left_ring_right";
//    //标准小环岛 绕环岛调头，左侧通行地区的顺时针环岛  28
//    public final static String TYPE_ROUNDABOUT_LEFTRINGU_TURN = "roundabout_leftring_turn";
//    //标准小环岛,绕环岛直行,右侧通行地区的逆时针环岛  23
//    public final static String TYPE_ROUNDABOUT_RING_CONTINUE = "roundabout_ring_continue";
//    //标准小环岛,绕环岛左转,右侧通行地区的逆时针环岛  21
//    public final static String TYPE_ROUNDABOUT_RING_LEFT = "roundabout_ring_left";
//    //标准小环岛,绕环岛右转,右侧通行地区的逆时针环岛  22
//    public final static String TYPE_ROUNDABOUT_RING_RIGHT = "roundabout_ring_right";
//    //标准小环岛,绕环岛调头,右侧通行地区的逆时针环岛  24
//    public final static String TYPE_ROUNDABOUT_RING_UTURN = "roundabout_ring_uturn";
//    //驶出环岛，注意，这个是左侧通行地区的顺时针环岛   18
//    public final static String TYPE_LEAVE_ROUNDABOUT = "roundabout_leave";
//    //驶出环岛图标    12
//    public final static String TYPE_ROUNDABOUT_OUT = "roundabout_out";

    //左转 2
    public final static int TYPE_INT_LEFT = 2;
    //右转 3
    public final static int TYPE_INT_RIGHT = 3;
    //左前方 4
    public final static int TYPE_INT_LEFT_FRONT = 4;
    //右前方 5
    public final static int TYPE_INT_RIGHT_FRONT = 5;
    //左后方 6
    public final static int TYPE_INT_LEFT_BACK = 6;
    //右后方 7
    public final static int TYPE_INT_RIGHT_BACK = 7;
    //掉头 8
    public final static int TYPE_INT_TURN_AROUND = 8;
    //直行  9
    public final static int TYPE_INT_STRAIGHT = 9;
    //顺行 20
    public final static int TYPE_INT_SPECIAL_CONTINUE = 20;

//    //进入环岛 11
//    public final static int TYPE_INT_ROUNDABOUT = 11;
//    //进入环岛，注意，这个是左侧通行地区的顺时针环岛 17
//    public final static int TYPE_INT_ROUNDABOUT_LEFT_RING = 17;
//    //标准小环岛 绕环岛直行，左侧通行地区的顺时针环岛  27
//    public final static int TYPE_INT_ROUNDABOUT_LEFT_RING_CONTINUE = 27;
//    //标准小环岛,绕环岛左转,左侧通行地区的顺时针环岛  25
//    public final static int TYPE_INT_ROUNDABOUT_LEFT_RING_LEFT = 25;
//    //标准小环岛 绕环岛右转，左侧通行地区的顺时针环岛  26
//    public final static int TYPE_INT_ROUNDABOUT_LEFT_RING_RIGHT = 26;
//    //标准小环岛 绕环岛调头，左侧通行地区的顺时针环岛  28
//    public final static int TYPE_INT_ROUNDABOUT_LEFTRINGU_TURN = 28;
//    //标准小环岛,绕环岛直行,右侧通行地区的逆时针环岛  23
//    public final static int TYPE_INT_ROUNDABOUT_RING_CONTINUE = 23;
//    //标准小环岛,绕环岛左转,右侧通行地区的逆时针环岛  21
//    public final static int TYPE_INT_ROUNDABOUT_RING_LEFT = 21;
//    //标准小环岛,绕环岛右转,右侧通行地区的逆时针环岛  22
//    public final static int TYPE_INT_ROUNDABOUT_RING_RIGHT = 22;
//    //标准小环岛,绕环岛调头,右侧通行地区的逆时针环岛  24
//    public final static int TYPE_INT_ROUNDABOUT_RING_UTURN = 24;
//    //驶出环岛，注意，这个是左侧通行地区的顺时针环岛   18
//    public final static int TYPE_INT_LEAVE_ROUNDABOUT = 18;
//    //驶出环岛图标    12
//    public final static int TYPE_INT_ROUNDABOUT_OUT = 12;

    /**
     * 导航sdk类型
     */
    private int naviMapType;

    /**
     * 导航状态
     */
    private String naviState;

    /**
     * 当前路段名称
     */
    private String mCurrentRoadName;

    /**
     * 下个路段名称
     */
    private String mNextRoadName;

    /**
     * 当前车速
     */
    private int CurrentSpeed;

    /**
     * 转向图标
     * bitmap转base64
     */
    private String mTurnIcon;

    /**
     * 转向类型
     * 因为sdk 有些转向是int 有些是string的
     */
    private int mTurnType;

    /**
     * 转向类型
     * 因为sdk 有些转向是int 有些是string的
     */
    private String mTurnTypeStr;

    /**
     * 导航剩余距离
     */
    private int mPathRetainDistance;

    /**
     * 导航剩余时间
     */
    private int mPathRetainTime;

    /**
     * 当前路段剩余距离(距离下个路段的距离)
     */
    private int mCurRoadRetainDistance;

    /**
     * 语音播报文本
     */
    private String mTtsText;


    private String type;

    public IMNaviInfo() {
        type = getType();
    }

    public int getmTurnType() {
        return mTurnType;
    }

    public void setmTurnType(int mTurnType) {
        this.mTurnType = mTurnType;
    }

    public String getmTurnTypeStr() {
        return mTurnTypeStr;
    }

    public void setmTurnTypeStr(String mTurnTypeStr) {
        this.mTurnTypeStr = mTurnTypeStr;
    }

    public int getNaviMapType() {
        return naviMapType;
    }

    public void setNaviMapType(int naviMapType) {
        this.naviMapType = naviMapType;
    }

    public String getNaviState() {
        return naviState;
    }

    public void setNaviState(String naviState) {
        this.naviState = naviState;
    }

    public String getmCurrentRoadName() {
        return mCurrentRoadName;
    }

    public void setmCurrentRoadName(String mCurrentRoadName) {
        this.mCurrentRoadName = mCurrentRoadName;
    }

    public String getmNextRoadName() {
        return mNextRoadName;
    }

    public void setmNextRoadName(String mNextRoadName) {
        this.mNextRoadName = mNextRoadName;
    }

    public int getCurrentSpeed() {
        return CurrentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        CurrentSpeed = currentSpeed;
    }

    public String getmTurnIcon() {
        return mTurnIcon;
    }

    public void setmTurnIcon(String mTurnIcon) {
        this.mTurnIcon = mTurnIcon;
    }


    public int getmPathRetainDistance() {
        return mPathRetainDistance;
    }

    public void setmPathRetainDistance(int mPathRetainDistance) {
        this.mPathRetainDistance = mPathRetainDistance;
    }

    public int getmPathRetainTime() {
        return mPathRetainTime;
    }

    public void setmPathRetainTime(int mPathRetainTime) {
        this.mPathRetainTime = mPathRetainTime;
    }

    public int getmCurRoadRetainDistance() {
        return mCurRoadRetainDistance;
    }

    public void setmCurRoadRetainDistance(int mCurRoadRetainDistance) {
        this.mCurRoadRetainDistance = mCurRoadRetainDistance;
    }

    public String getmTtsText() {
        return mTtsText;
    }

    public void setmTtsText(String mTtsText) {
        this.mTtsText = mTtsText;
    }
}
