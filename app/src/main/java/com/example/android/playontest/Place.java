package com.example.android.playontest;

        /**
         * Created by Kingsley on 2/14/2018.
         */

    public class Place {
        private String mName;
        private String mAddress;

        private int mImageResourceId = NO_IMAGE_PROVIDED;
        private static final int NO_IMAGE_PROVIDED = -1;

        public Place (String name, String address) {
            mName = name;
            mAddress = address;

        }

        public Place (String name, String address, int imageResourceId) {
            mName = name;
            mAddress = address;
            mImageResourceId = imageResourceId;

        }

        public String getName(){
            return mName;
        }
        public String getAddress(){return mAddress; }
        public int getImageResourceID(){
            return mImageResourceId;
        }
        public boolean hasImage() {return mImageResourceId != NO_IMAGE_PROVIDED;}

        }






