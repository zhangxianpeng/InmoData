package com.inmo.data.navi;

import android.graphics.Bitmap;

import com.inmo.data.AbstractInfo;
import com.inmo.data.MessageType;
import com.inmo.data.message.Dispatcher;

@MessageType(type = Dispatcher.NAVI_INFO)
public class BtNaviInfo extends AbstractInfo {
    private String type;
    protected long pathID;
    protected int mType;
    protected String mCurRoadName;
    protected String mNextRoadName;
    protected String mIcon;
    protected String mRouteRemainDis;
    protected String mRouteRemainTime;
    protected String mSegRemainDis;
    protected String mDirection;
    protected int mSegRemainTime;
    protected int mCurSegIndex;
    protected int mCurLinkIndex;
    protected int mCurPointIndex;
    protected int currentSpeed;
    private Bitmap iconBitmap;
    protected int routeRemainLightCount;
    protected double mRouteTotalDistance;
    protected boolean firstBatchData = false;
    public BtNaviInfo() {
        type = getType();
    }

    public double getmRouteTotalDistance() {
        return mRouteTotalDistance;
    }

    public void setmRouteTotalDistance(double mRouteTotalDistance) {
        this.mRouteTotalDistance = mRouteTotalDistance;
    }

    public boolean isFirstBatchData() {
        return firstBatchData;
    }

    public void setFirstBatchData(boolean firstBatchData) {
        this.firstBatchData = firstBatchData;
    }

    public long getPathId() {
        return this.pathID;
    }

    public void setPathId(long var1) {
        this.pathID = var1;
    }

    public String getmDirection() {
        return mDirection;
    }

    public void setmDirection(String mDirection) {
        this.mDirection = mDirection;
    }

    /** @deprecated */
    public int getCurrentSpeed() {
        return this.currentSpeed;
    }

    /** @deprecated */
    public void setCurrentSpeed(int var1) {
        this.currentSpeed = var1;
    }

    public int getNaviType() {
        return this.mType;
    }

    public void setNaviType(int var1) {
        this.mType = var1;
    }

    public String getCurrentRoadName() {
        return this.mCurRoadName;
    }

    public void setCurrentRoadName(String var1) {
        this.mCurRoadName = var1;
    }

    public String getNextRoadName() {
        return this.mNextRoadName;
    }

    public void setNextRoadName(String var1) {
        this.mNextRoadName = var1;
    }

    public String getIconType() {
        return this.mIcon;
    }

    public void setIconType(String var1) {
        this.mIcon = var1;
    }

    public String getPathRetainDistance() {
        return this.mRouteRemainDis;
    }

    public void setPathRetainDistance(String var1) {
        this.mRouteRemainDis = var1;
    }

    public String getPathRetainTime() {
        return this.mRouteRemainTime;
    }

    public void setPathRetainTime(String var1) {
        this.mRouteRemainTime = var1;
    }

    public String getCurStepRetainDistance() {
        return this.mSegRemainDis;
    }

    public void setCurStepRetainDistance(String var1) {
        this.mSegRemainDis = var1;
    }

    public int getCurStepRetainTime() {
        return this.mSegRemainTime;
    }

    public void setCurStepRetainTime(int var1) {
        this.mSegRemainTime = var1;
    }

    public int getCurStep() {
        return this.mCurSegIndex;
    }

    public void setCurStep(int var1) {
        this.mCurSegIndex = var1;
    }

    public int getCurLink() {
        return this.mCurLinkIndex;
    }

    public void setCurLink(int var1) {
        this.mCurLinkIndex = var1;
    }

    public int getCurPoint() {
        return this.mCurPointIndex;
    }

    public void setCurPoint(int var1) {
        this.mCurPointIndex = var1;
    }

    public Bitmap getIconBitmap() {
        return this.iconBitmap;
    }

    public void setIconBitmap(Bitmap var1) {
        this.iconBitmap = var1;
    }

    public int getRouteRemainLightCount() {
        return this.routeRemainLightCount;
    }

    public void setRouteRemainLightCount(int var1) {
        this.routeRemainLightCount = var1;
    }
    @Override
    public String toString() {
        return "NotifyInfo{" +
                "type='" + type + '\'' +
                ", mCurRoadName='" + mCurRoadName + '\'' +
                ", mNextRoadName='" + mNextRoadName + '\'' +
                '}';
    }

}
