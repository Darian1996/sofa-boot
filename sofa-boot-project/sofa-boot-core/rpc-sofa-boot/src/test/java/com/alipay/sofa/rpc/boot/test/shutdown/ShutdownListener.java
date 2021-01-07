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
package com.alipay.sofa.rpc.boot.test.shutdown;

import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.TestExecutionListener;

/**
 * @author huzijie
 * @version ShutdownListner.java, v 0.1 2021年01月05日 9:14 下午 huzijie Exp $
 */
public class ShutdownListener implements TestExecutionListener {

    @Override
    public void afterTestClass(TestContext testContext) throws Exception {
        if (testContext.getTestClass().equals(RpcShutdownTest.class))
            testContext.markApplicationContextDirty(DirtiesContext.HierarchyMode.CURRENT_LEVEL);
    }
}
