package StructuralType.AdapterPattern;

public class DataAdapter implements NewDataTarget {

        private OldDataAdaptee mOldData;

        // 需要取得被轉換者的物件參考
        // 範例是利用建構者取得
        public DataAdapter(OldDataAdaptee oldDataAdaptee)
        {
            mOldData = oldDataAdaptee;
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
