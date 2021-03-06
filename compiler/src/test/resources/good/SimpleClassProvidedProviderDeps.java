/*
 * Copyright 2013 Google LLC
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
 */
package tests;

import com.google.auto.factory.AutoFactory;
import com.google.auto.factory.Provided;
import jakarta.inject.Provider;

/**
 * @author Gregory Kick
 */
@AutoFactory
@SuppressWarnings("unused")
final class SimpleClassProvidedProviderDeps {
  private final Provider<String> providedDepA;
  private final Provider<String> providedDepB;

  SimpleClassProvidedProviderDeps(
      @Provided @AQualifier Provider<String> providedDepA,
      @Provided @BQualifier Provider<String> providedDepB) {
    this.providedDepA = providedDepA;
    this.providedDepB = providedDepB;
  }
}
