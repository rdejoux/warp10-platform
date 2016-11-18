//
//   Copyright 2016  Cityzen Data
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.
//

package io.warp10.script.ext.lua;

import java.util.HashMap;
import java.util.Map;

import io.warp10.warp.sdk.WarpScriptExtension;

public class LUAWarpScriptExtension extends WarpScriptExtension {
  private static final Map<String, Object> functions;
  
  static {
    functions = new HashMap<String, Object>();
    functions.put("LUA", new LUA("LUA"));        
  }
  
  @Override
  public Map<String, Object> getFunctions() {
    return functions;
  }
}
