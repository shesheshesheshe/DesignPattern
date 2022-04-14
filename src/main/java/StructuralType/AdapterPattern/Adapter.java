package StructuralType.AdapterPattern;

public class Adapter implements NewTarget {

        private OldAdaptee mOldData;

        // 需要取得被轉換者的物件參考
        // 範例是利用建構者取得
        public Adapter(OldAdaptee oldAdaptee)
        {
            mOldData = oldAdaptee;
        }

        // 實作介面的方法，並把方法都導向
        // 使用被轉接者提供的方法
        @Override
        public void loveRedHat()
        {
            mOldData.killRedHat();
        }

        @Override
        public void sleep()
        {
            mOldData.sleep();
        }

}
