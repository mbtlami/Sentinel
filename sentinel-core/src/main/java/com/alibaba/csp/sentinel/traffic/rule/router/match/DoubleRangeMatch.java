/*
 * Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.csp.sentinel.traffic.rule.router.match;

/**
 * @author panxiaojun233
 */
public class DoubleRangeMatch {
    private Double start;
    private Double end;

    public Double getStart() {
        return start;
    }

    public void setStart(Double start) {
        this.start = start;
    }

    public Double getEnd() {
        return end;
    }

    public void setEnd(Double end) {
        this.end = end;
    }


    public boolean isMatch(Double input) {
        if (start != null && end != null) {
            return input.compareTo(start) >= 0 && input.compareTo(end) < 0;
        } else if (start != null) {
            return input.compareTo(start) >= 0;
        } else if (end != null) {
            return input.compareTo(end) < 0;
        } else {
            return false;
        }
    }
}
