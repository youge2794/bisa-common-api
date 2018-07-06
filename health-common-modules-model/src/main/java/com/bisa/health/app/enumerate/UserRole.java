package com.bisa.health.app.enumerate;

public enum UserRole {
    USER{//用户

        @Override
        public int value() {
            return 1;
        }
        
    },
    ADMIN{//管理员

        @Override
        public int value() {
            return 2;
        }
        
    },
    CUSTOMER{//客服
        @Override
        public int value() {
            return 3;
        }
    },
    WAREHOUSE{//出入库管理员
        @Override
        public int value() {
            return 4;
        }
    };
    
    public abstract int value();
    
    
}
