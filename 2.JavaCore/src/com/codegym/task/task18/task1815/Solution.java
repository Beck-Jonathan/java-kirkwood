package com.codegym.task.task18.task1815;

import java.util.List;

/* 
Table

*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface {
        TableInterface _ti;
        String header;

        public TableInterfaceWrapper(TableInterface ti) {
            this._ti = ti;

        }

        public void setModel(List rows) {

            System.out.println(rows.size());
            _ti.setModel(rows);

        }

        @Override
        public String getHeaderText() {
            return _ti.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            _ti.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}