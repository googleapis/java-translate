# Copyright 2018 Google LLC
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

"""This script is used to synthesize generated parts of this library."""

import synthtool.languages.java as java

service = 'translation'
versions = ['v3beta1', 'v3']

for version in versions:
  java.bazel_library(
      service=service,
      version=version,
      proto_path=f'google/cloud/translate/{version}',
      bazel_target=f'//google/cloud/translate/{version}:google-cloud-{service}-{version}-java',
      destination_name='translate',
  )

java.common_templates()
