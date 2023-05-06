/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.rocketmq.connect.clickhouse.config;

import java.util.HashSet;
import java.util.Set;

public class ClickHouseSourceConfig extends ClickHouseBaseConfig {

    public static final Set<String> REQUEST_CONFIG = new HashSet<String>() {
        {
            add(ClickHouseConstants.CLICKHOUSE_HOST);
            add(ClickHouseConstants.CLICKHOUSE_PORT);
            add(ClickHouseConstants.CLICKHOUSE_TABLE);
        }
    };
    private String table;

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }
}
