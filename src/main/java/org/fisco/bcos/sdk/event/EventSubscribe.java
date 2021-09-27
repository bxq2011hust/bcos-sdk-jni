/*
 * Copyright 2014-2020  [fisco-dev]
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 */

package org.fisco.bcos.sdk.event;

import org.fisco.bcos.sdk.common.ConfigOption;

public class EventSubscribe {

  static {
    System.loadLibrary("fisco-cpp-sdk");
  }

  /**
   * construct EventSubscribe instance
   *
   * @param group
   * @return
   */
  public static native EventSubscribe build(String group, ConfigOption config);

  public native void start();

  public native void stop();

  public native void subscribeEvent(EventSubcribeParams params, EventSubscribeCallback callback);

  public native void unsubscribeEvent(String registerID, EventSubscribeCallback callback);
}